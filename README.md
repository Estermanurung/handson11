**Nama :**Ester Manurung 
**NIM :**2481019 
**Kelas :**TI 
**Mata Kuliah :**Pemograman Berorientasi Objek

##Catatan Pembelajaran##

##Latihan 4 - Interface Segregation Principle (ISP)

-Setiap class hanya  **wajib mengimplementasikan method yang benar-benar dibutuhkan**

## BAD
-Semua dokumen memaki  **satu interface besar **
-Banyak class harus implement method yang tidak relevan**

## GOOD
-Interface dipecah menjadi spesifik dan sesuai kebutuhan:

| Interface | Capability | Untuk |
|----------|------------|------|
| `Readable` | baca dokumen | semua dokumen |
| `Editable` | edit konten | Word, Spreadsheet |
| `Printable` | cetak | PDF, Word, Spreadsheet |
| `Calculable` | formula | Spreadsheet |
| `Resizable` | ubah ukuran | Image |

## Outputnya

![Cuplikan layar 2025-11-27 213123.png](../../Pictures/Screenshots/Cuplikan%20layar%202025-11-27%20213123.png)
![Cuplikan layar 2025-11-27 213115.png](../../Pictures/Screenshots/Cuplikan%20layar%202025-11-27%20213115.png)
![Cuplikan layar 2025-11-27 213051.png](../../Pictures/Screenshots/Cuplikan%20layar%202025-11-27%20213051.png)
![Cuplikan layar 2025-11-27 213037.png](../../Pictures/Screenshots/Cuplikan%20layar%202025-11-27%20213037.png)

## 🎯 LATIHAN 5 - Dependency Inversion Principle (DIP)

### 📌 Prinsip

Artinya:  
➡️ `PaymentService` tidak boleh membuat dependency sendiri dengan `new`  
➡️ Harus gunakan **interface** + **Dependency Injection**

### BAD
`PaymentService` terikat (tightly coupled) dengan concrete class:

- `new CardValidator()`
- `new FraudDetector()`
- `new PaymentGateway()`
- `new TransactionLogger()`
- `new NotificationSender()`

➡️ Sulit testing, sulit ganti gateway (Stripe → PayPal)

### GOOD
Semua tergantung pada **interface**, bukan class:

| Abstraction | Implementasi Contoh |
|------------|------------------|
| `CardValidator` | `LuhnCardValidator` |
| `FraudDetector` | `RuleBasedFraudDetector` |
| `PaymentGateway` | `StripePaymentGateway`, `PayPalPaymentGateway` |
| `TransactionLogger` | `DatabaseTransactionLogger` |
| `NotificationSender` | `EmailNotificationSender` |

## Ouputnya 

![Cuplikan layar 2025-11-27 213401.png](../../Pictures/Screenshots/Cuplikan%20layar%202025-11-27%20213401.png)
![Cuplikan layar 2025-11-27 213453.png](../../Pictures/Screenshots/Cuplikan%20layar%202025-11-27%20213453.png)
![Cuplikan layar 2025-11-27 213444.png](../../Pictures/Screenshots/Cuplikan%20layar%202025-11-27%20213444.png)
