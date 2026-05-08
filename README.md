Social Media Microservices Application

A modern full-stack social media platform developed using Microservices Architecture with Spring Boot, React.js, Docker, Eureka Service Discovery, and API Gateway.

🚀 Features
User registration and login
Create and manage posts
Responsive frontend using React.js
Microservices-based backend
API Gateway routing
Eureka Service Discovery
Docker containerization
REST API communication
Distributed system architecture
🛠️ Technologies Used
Frontend
React.js
Axios
HTML5
CSS3
JavaScript
Backend
Java
Spring Boot
Spring Cloud Gateway
Eureka Server
REST APIs
DevOps & Tools
Docker
Docker Compose
Maven
Git & GitHub
📁 Project Structure
social-media-project
│
├── api-gateway
├── service-discovery
├── user-service
├── social-media-frontend
└── docker-compose.yml
⚙️ System Requirements
Hardware Requirements
Processor: Intel i3 or above
RAM: 4 GB minimum
Storage: 20 GB free space
Software Requirements
Java 17+
Node.js
Docker Desktop
Maven
Git
VS Code / IntelliJ IDEA
🐳 Docker Setup
Clone Repository
git clone https://github.com/YOUR_USERNAME/social-media-project.git
Navigate to Project Folder
cd social-media-project
Run Docker Containers
docker compose up --build
🌐 Application URLs
Eureka Server
http://localhost:8761
API Gateway
http://localhost:8083
Frontend Application
http://localhost:3000
📦 Microservices
Service	Port	Description
Eureka Server	8761	Service Discovery
API Gateway	8083	Request Routing
User Service	8081	User Management
Frontend	3000	React Application
🔄 Architecture
React Frontend
       │
       ▼
API Gateway
       │
 ┌─────────────┐
 ▼             ▼
User Service  Other Services
       │
       ▼
 Eureka Server
✅ Functionalities
User management
Service registration
API routing
Frontend-backend integration
Dockerized deployment
Distributed communication
🔮 Future Enhancements
JWT Authentication
Likes and comments
Real-time chat
Notifications
Image upload
Cloud deployment
Kubernetes integration
AI-based recommendations
📚 Learning Outcomes

This project demonstrates:

Microservices Architecture
Distributed Systems
REST API Development
Docker Containerization
Service Discovery
API Gateway Integration
Frontend and Backend Communication
👨‍💻 Author

Sravan Kumar

📜 License

This project is developed for educational and learning purposes.
