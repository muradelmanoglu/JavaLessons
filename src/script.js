function calculateDelivery() {
    // 1. Giriş Məlumatlarını Almaq

    // DÜZƏLİŞ: HTML-də 'city-select' ID-si olduğu üçün onu istifadə edirik.
    const citySelect = document.getElementById('city-select');
    // Seçilmiş dəyəri (Bakı, Xırdalan, Sumqayıt) kiçik hərflərə çeviririk
    const city = citySelect.value.toLowerCase().trim();

    const priceInput = document.getElementById('price').value;
    const productPrice = parseFloat(priceInput);

    // Məlumatların düzgünlüyünü yoxlamaq
    if (city === "" || isNaN(productPrice) || productPrice < 0) {
        document.getElementById('status-message').innerText = "❌ XƏTA: Zəhmət olmasa, bölgə seçin və qiyməti düzgün daxil edin.";
        document.getElementById('delivery-cost').innerText = "0.00 AZN";
        document.getElementById('total-cost').innerText = "0.00 AZN";
        return;
    }

    let baseDeliveryCost = 0;
    let finalDeliveryCost = 0;
    let statusMessage = "";

    // 2. Şəhərə görə baza qiyməti təyin etmək
    switch (city) {
        case 'bakı':
            baseDeliveryCost = 5.0;
            break;
        case 'xırdalan':
            baseDeliveryCost = 6.0;
            break;
        case 'sumqayıt':
            baseDeliveryCost = 7.0;
            break;
        default:
            // Bu hal, yuxarıdakı boş dəyər yoxlanışı sayəsində nadirən baş verməlidir
            document.getElementById('status-message').innerText = "❌ XƏTA: Seçilən bölgə (" + city.toUpperCase() + ") çatdırılma siyahısında yoxdur!";
            document.getElementById('delivery-cost').innerText = "0.00 AZN";
            document.getElementById('total-cost').innerText = "0.00 AZN";
            return;
    }

    // 3. Pulsuz Çatdırılma Şərtini Yoxlamaq (50.0 AZN və yuxarı)
    finalDeliveryCost = baseDeliveryCost;

    if (productPrice >= 50.0) {
        finalDeliveryCost = 0.0;
        statusMessage = "✅ Ödənişsiz Çatdırılma!";
    } else {
        statusMessage = "⚠️ Ödənişli Çatdırılma! (" + baseDeliveryCost.toFixed(2) + " AZN)";
    }

    // 4. Yekun Hesablama
    const totalCost = productPrice + finalDeliveryCost;

    // 5. Nəticələri HTML səhifəsinə yazmaq
    document.getElementById('status-message').innerText = statusMessage;
    document.getElementById('delivery-cost').innerText = finalDeliveryCost.toFixed(2) + " AZN";
    document.getElementById('total-cost').innerText = totalCost.toFixed(2) + " AZN";
}