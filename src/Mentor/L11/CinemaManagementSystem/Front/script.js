// Virtual Məlumat Bazası (Hall Data)
let hall = [
    [null, null, null],
    [null, null, null],
    [null, null, null]
];

// 1. GİRİŞ FUNKSİYASI
function handleLogin() {
    const user = document.getElementById('username').value;
    const pass = document.getElementById('password').value;

    if (user === "Kassir1" && pass === "12345") {
        document.getElementById('login-box').classList.add('hidden');
        document.getElementById('main-app').classList.remove('hidden');
        document.getElementById('user-display').innerText = user;
        renderHall();
    } else {
        document.getElementById('error-msg').innerText = "❌ Giriş xətası! Məlumatları yoxlayın.";
    }
}

// 2. BÖLMƏLƏR ARASI KEÇİD
function showSection(sectionId) {
    document.querySelectorAll('.section').forEach(s => s.classList.add('hidden'));
    document.getElementById(sectionId).classList.remove('hidden');

    if (sectionId === 'view-hall') renderHall();
}

// 3. ZALI EKRANA ÇIXARMAQ
function renderHall() {
    const container = document.getElementById('hall-grid-container');
    container.innerHTML = '';

    for (let r = 0; r < 3; r++) {
        for (let c = 0; c < 3; c++) {
            const seat = document.createElement('div');
            const isOccupied = hall[r][c] !== null;

            seat.className = `seat ${isOccupied ? 'occupied' : ''}`;
            seat.innerHTML = `
                <strong>${r}-${c}</strong><br>
                <span>${isOccupied ? hall[r][c].name : 'BOŞ'}</span>
            `;

            if (isOccupied) {
                seat.onclick = () => deleteBooking(r, c);
            }
            container.appendChild(seat);
        }
    }
}

// 4. BRON ƏLAVƏ ETMƏK
function addBooking() {
    const r = parseInt(document.getElementById('row-in').value);
    const c = parseInt(document.getElementById('col-in').value);
    const name = document.getElementById('name-in').value;

    if (isNaN(r) || isNaN(c) || !name) {
        alert("Lütfən bütün xanaları doldurun!");
        return;
    }

    if (r < 0 || r > 2 || c < 0 || c > 2) {
        alert("Xəta: Sıra və ya Yer 0-2 aralığında olmalıdır!");
        return;
    }

    if (hall[r][c]) {
        alert("Xəta: Bu yer artıq bron olunub!");
    } else {
        hall[r][c] = { name: name, timestamp: new Date().toLocaleTimeString() };
        alert(`✅ ${name} üçün uğurla bron edildi!`);
        clearInputs();
        showSection('view-hall');
    }
}

// 5. BRON SİLMƏK
function deleteBooking(r, c) {
    const person = hall[r][c].name;
    if (confirm(`${person} adlı müştərinin bronunu silmək istəyirsiniz?`)) {
        hall[r][c] = null;
        renderHall();
    }
}

// 6. AXTARIŞ
function searchName() {
    const query = document.getElementById('search-name').value.toLowerCase();
    const resultDiv = document.getElementById('search-result');
    let results = [];

    if (!query) {
        resultDiv.innerHTML = "Lütfən ad daxil edin.";
        return;
    }

    for (let r = 0; r < 3; r++) {
        for (let c = 0; c < 3; c++) {
            if (hall[r][c] && hall[r][c].name.toLowerCase().includes(query)) {
                results.push(`📍 Sıra: ${r}, Yer: ${c} (Müştəri: ${hall[r][c].name})`);
            }
        }
    }

    resultDiv.innerHTML = results.length > 0
        ? results.join('<br>')
        : "🔍 Təəssüf ki, belə bir bron tapılmadı.";
}

// 7. KÖMƏKÇİ FUNKSİYALAR
function clearInputs() {
    document.getElementById('row-in').value = '';
    document.getElementById('col-in').value = '';
    document.getElementById('name-in').value = '';
}

function logout() {
    if(confirm("Sistemdən çıxmaq istəyirsiniz?")) {
        location.reload();
    }
}