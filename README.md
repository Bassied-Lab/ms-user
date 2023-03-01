# ms-user

### for local run use application-local.yml

### --postgres
docker run --name ms-user -p 5432:5432 -e POSTGRES_PASSWORD=postgres -e POSTGRES_DB=users -d postgres