## 🚀 Initializing the Spring Boot Backend

To create the Spring Boot project, follow these steps using **Visual Studio Code**:

### 🛠️ Project Creation with Spring Initializr

1. Open **Visual Studio Code**
2. Go to `View` > `Command Palette` (or press `Ctrl + Shift + P`)
3. Search for and select:  
   **Spring Initializr: Create a Gradle Project**
4. Configure the project as follows:

| Option                | Value             |
|-----------------------|------------------|
| **Project Type**      | Gradle            |
| **Spring Boot Version** | 3.2.x or latest (3.5 if available) |
| **Language**          | Java              |
| **Group**             | `com.api`         |
| **Artifact (Name)**   | `products`        |
| **Packaging**         | JAR               |
| **Java Version**      | 21                |

### 📦 Dependencies to Include

Make sure to select the following dependencies when prompted:

- **Spring Boot DevTools**  
- **Spring Web**  
- **Spring Data JPA**  
- **PostgreSQL Driver**  
- **Lombok**

> 💡 After generating the project, the structure will be available under the `/backend` directory (or wherever you save it).  
> You can then open the folder in VS Code and start developing your REST API.

### 📁 Finalizing Project Setup

After selecting all the required dependencies:

1. Click **OK** to confirm your selections.
2. When prompted with **"Select Folder"**, choose:
   **`Generate into this folder`**

This will generate the Spring Boot project directly inside the current folder, avoiding nested directories.

Once the project is created:

- VS Code may prompt you to **"Import Gradle Project"** – accept it.
- Wait for the Gradle build to finish syncing the dependencies.

You now have a fully functional Spring Boot project set up and ready to start coding!

## 🐳 Running PostgreSQL with Docker Compose

This project uses **PostgreSQL** as the database, and to simplify setup, a `docker-compose.yml` file is provided to run PostgreSQL inside a Docker container.

### 🚀 How to Run PostgreSQL Container

1. Make sure you have [Docker](https://www.docker.com/get-started) and [Docker Compose](https://docs.docker.com/compose/install/) installed on your machine.
2. From the root directory of the project (where `docker-compose.yml` is located), run the command:

```bash
docker-compose up -d
```