# City Electronics - POS System

**HND in Computing - Programming Module**

A Point of Sale (POS) system for an electronics shop built with **Java Swing**. This project was developed as part of the **Higher National Diploma (HND) in Computing** - **Programming** module assignment.

---

## Module Information

| Detail | Information |
|--------|-------------|
| **Module** | Programming |
| **Course** | HND in Computing |
| **Student** | Alex Abishan |
| **GitHub** | [@AlexAbishan11](https://github.com/AlexAbishan11) |

---

## Features

###  Customer Side
- Customer registration & login (phone + password)
- Browse products by category:
  - Communication (Mobiles, Laptops)
  - Computer Accessories (Keyboards, Mice, Pendrives)
  - TV & Audio (TVs, Speakers)
- Add products to cart with quantity
- View cart with total amount
- Billing & place order

### Admin Side
- Admin login (username: `alex`, password: `1234`)
- Add new products (with category & image path)
- Modify existing products
- Delete products
- View all customer orders

---

## Technologies Used

| Technology | Purpose |
|------------|---------|
| Java | Core language |
| Java Swing | GUI Framework |
| NetBeans IDE | Development environment |
| Object-Oriented Programming | Design pattern |
| Collections (ArrayList, HashMap) | In-memory data storage |

---
##  Project Structure

CityElectronics/
├── src/
│ ├── admin/ # Admin UI classes
│ │ ├── AdminLoginUI.java
│ │ ├── AdminDashboardUI.java
│ │ ├── AddProductUI.java
│ │ ├── ModifyProductUI.java
│ │ ├── DeleteProductUI.java
│ │ └── ViewOrdersUI.java
│ │
│ ├── customer/ # Customer UI classes
│ │ ├── CustomerLoginUI.java
│ │ ├── CustomerDashboardUI.java
│ │ ├── ProductListUI.java
│ │ ├── CartUI.java
│ │ └── BillingUI.java
│ │
│ ├── models/ # Data models
│ │ ├── Product.java
│ │ ├── Customer.java
│ │ ├── Cart.java
│ │ ├── CartItem.java
│ │ └── Order.java
│ │
│ ├── utils/ # Data storage (in-memory)
│ │ ├── ProductData.java
│ │ ├── CustomerData.java
│ │ ├── OrderData.java
│ │ └── SampleData.java
│ │
│ ├── ui/ # Main UI
│ │ └── MainUI.java
│ │
│ └── images/ # Product images
│
└── README.md


---

##  Setup Instructions

### Prerequisites
- Java JDK 8 or higher
- NetBeans IDE (or any Java IDE)

### Steps to Run

1. **Clone or download** this repository
2. **Open NetBeans IDE**
3. **File → Open Project** → Select `CityElectronics` folder
4. **Right-click project** → **Run**
5. Main UI will open with **Admin** and **Customer** buttons

### Admin Login
- **Username:** `alex`
- **Password:** `1234`

### Customer Login
- **Sign up** with phone number & password
- Then **login** with same credentials

---



---

##  Key Features Explained

### In-Memory Data Storage
This project uses **ArrayList** and **HashMap** to store data during runtime. No database is required. Data will reset when the application closes.

### Object-Oriented Design
- **Models** — Data classes (Product, Customer, Order, Cart)
- **UI** — Swing forms for user interaction
- **Utils** — Data management (ProductData, CustomerData, OrderData)
- **Admin/Customer** — Separate packages for role-based access

---

##  Login Credentials

| Role | Username | Password |
|------|----------|----------|
| Admin | `alex` | `1234` |
| Customer | (any phone) | (any password, min 4 chars) |

---

##  Author

**Alex Abishan**
- GitHub: [@AlexAbishan11](https://github.com/AlexAbishan11)
- Email: abiabishan725@gmail.com
- Course: HND in Computing
- Module: Programming

---

##  License

This project is created for **educational purposes** as part of the HND in Computing - Programming module assignment.