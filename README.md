# To run the application:

### To spin up the postgres dependency:
```bash
docker compose up -d postgres
```

To stop the running postgres container:
```bash
docker compose down postgres
```

### To run the application:
```bash
sbt "runMain runner.Main"
```

## To run the test:
```bash
sbt test
```

```bash
sbt 'integration / test'
```