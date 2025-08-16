# 💊 Pharmacy Management System  

## 📖 Overview  
The **Pharmacy Management System** is a Java-based desktop application that helps automate the day-to-day operations of a pharmacy.  
It provides two separate dashboards for **Admin** and **Pharmacist**, allowing them to manage medicines, sales, billing, and user profiles efficiently.  

This project is built using **Java Swing** for the frontend, **JDBC** for database connectivity, and **MySQL** as the backend database.  

---

## 🚀 Features  

### 🔐 Authentication  
- Login system for **Admin** and **Pharmacist**  

### 💊 Medicine Management  
- Add new medicines  
- Update existing medicines (price, stock, expiry date)  
- View medicine stock  

### 🛒 Sales & Billing  
- Sell medicines and auto-update stock  
- Generate and view bills  
- Export bills as **PDF**  

### 👤 User Management  
- Admin can add/update/view users  
- Pharmacist can view their profile  

### 📊 Dashboards  
- **Admin Dashboard** – Manage users, medicines, and reports  
- **Pharmacist Dashboard** – Handle daily pharmacy tasks (Add, Sell, Update, View medicines & bills)  

---

## 🛠️ Tech Stack  

- **Language:** Java  
- **Frontend:** Swing / AWT  
- **Backend:** MySQL Database  
- **Database Connectivity:** JDBC  
- **Utilities:** PDF Handling, Image Assets  
- **IDE:** NetBeans / Eclipse  

---

## ⚙️ Installation & Setup  

### 1️⃣ Clone the Repository  
```bash
git clone https://github.com/your-username/Pharmacy-Management-System.git
cd Pharmacy-Management-System

2️⃣ Set Up Database

Install MySQL

Create a database (e.g., pharmacydb)

Import the provided db.sql file

CREATE DATABASE pharmacydb;
USE pharmacydb;
SOURCE db.sql;


Update database credentials in ConnectionProvider.java

String url = "jdbc:mysql://localhost:3306/pharmacydb";
String user = "root";
String password = "yourpassword";

3️⃣ Run the Project
Build & Run Pharmacy.java (or Login.java)
