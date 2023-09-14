
[[_TOC_]]

# BooksStore Project

    Welcome to the BooksStore project! This Java-based web application is designed to provide a comprehensive
    platform for managing and exploring a collection of books. Below, you will find information on how to set 
    up and run the project, the technologies and frameworks used, and an overview of its key features.
1. [Installation and Setup](#install)
2. [Technologies and Frameworks](#technologies)
3. [About the Project](#aboutProject)
   


---
## 1. <a name="install">Installation and Setup</a>

To get started with the BooksStore project, follow these steps:
1. Navigate to your working directory:
    ```bash
   cd youWorkFolder
2. Clone the project repository from GitHub:
    ```bash
   git clone https://github.com/stanislavHUB/BooksStore.git
3. Change into the project directory:
    ```bash
   cd BooksStore
4. Build and install the project using Maven:
    ```bash
   mvn clean install
5. Stop the PostgreSQL service (if running):
    ```bash
   systemctl stop postgresql
6. Start the project's Docker containers in detached mode:
    ```bash
   docker-compose up -d
7. Open your web browser and access the BooksStore application at 
> http://localhost:3000/market-front

> [!WARNING]
> Ensure you modify the PostgreSQL **user** and **password** in the project's configuration, or create a new user with appropriate credentials (e.g., user: **root**, password: **root**) as needed.

---
## 2. <a name="technologies">Technologies and Frameworks</a>
**The BooksStore project utilizes a variety of technologies and frameworks, including:**
-    AngularJS
-    Redis
-    Lombok
-    Java 17
-    JavaScript
-    Spring Boot
-    Spring Cloud Gateway
-    Spring Web Service
-    Spring Security
-    Spring Data JPA
-    JUnit
-    Mockito
-    Flyway Migration
-    MongoDB
-    Docker
-    PostgreSQL
-    Maven
-    Java Mail API
-    Google Books API
-    Open Exchange Rates API
---
## 3. <a name="aboutProject">About the Project</a>

**BooksStore offers a range of features for managing and exploring your books, including:**
    
1.    User registration and authentication
2.    Loading books from Google Books API and saving them to the database
3.    Creating new books
4.    Deleting books
5.    Changing user information
6.    Updating book information
7.    Banning/unbanning users
8.    Assigning roles to users
9.    Email notifications for product updates
10.    Book filtering and searching
11.    Adding products to the cart and completing checkout
12.    Adding ratings and comments to books
13.    Adding books to favorites

    The BooksStore project is a comprehensive solution for book enthusiasts and provides a 
    seamless experience for both book management and exploration.

    Thank you for choosing BooksStore for your book-related needs! If you have any questions 
    or need further assistance, please refer to the project's documentation or reach out to
    our support team.
    
    booksstore.supports@gmail.com
---
