# creating network
docker network create poc

# Starting keycloak
docker-compose up --build -d keycloak

# remove jwks file if exists
rm -rf ./oath-image/jwks.json

# waiting keycloak response on localhost:8080
until curl -s -f -o /dev/null "http://localhost:8080/auth/realms/master/protocol/openid-connect/certs"
do
  sleep 3
done

# Getting the public keys
curl -v http://localhost:8080/auth/realms/master/protocol/openid-connect/certs > ./oath-image/jwks.json

# Starting all the remaining services
docker-compose up --build -d go-api spring-api oath-keeper

