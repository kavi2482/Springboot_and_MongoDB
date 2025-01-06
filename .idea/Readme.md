 Pull the MongoDB Docker Image  -  docker pull mongo
 Run MongoDB Container       - docker run -d --name mongodb -p 27017:27017 -e MONGO_INITDB_ROOT_USERNAME=admin -e MONGO_INITDB_ROOT_PASSWORD=secret mongo


Mongosh :
mongodb://admin:secret@localhost:27017/admin
