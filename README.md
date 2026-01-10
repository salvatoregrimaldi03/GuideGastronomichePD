# GuideGastronomichePD
Java Enterprise Edition application of the Distributed Programming course regarding a restaurant archive managed by the GuideWatch Services organization, with the aim of tracking the presence of restaurants in well-known food guides.
## What is it?
**GuideGastronomichePD** is a JEE project of Distributed Programming course that consists of:
- Bean Project
- EJB Client Project
- JMS Client Project
- WS Client Project
## How to try it?
This project is an enterprise application developed in JavaEE 8.
### Prerequisites
- **Java Development Kit (JDK) 8**
- **GlassFish Server**
- **Apache Derby**
### Run locally
1. Clone the repository:
   ```bash
   git clone https://github.com/salvatoregrimaldi03/GuideGastronomichePD.git
   ```
2. Open the project in Apache Nebeans 27
3. Configure the Application Server (i.e., Services > Servers > Add Server -> Choose GlassFishServer
4. Add libraries in any project (Bean, EJB Client, JMS Client, WS Client), specifically:
   - Bean Project: javaee-api-8.0.jar
   - EJB Client Project: gf-client.jar, javaee-api-8.0.jar, derby.jar, derbyclient.jar
   - JMS Client Project: gf-client.jar, javaee-api-8.0.jar
   - WS Client Project: javaee-api-8.0.jar
5. Ready the GlassFish Server
6. Deploy the Bean Project and run any client file in any clients project  

## Build With
[JavaEE 8](https://www.oracle.com/java/technologies/java-ee-8.html) - Core language
