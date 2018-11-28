# Polydator

An application to determine the type of a polygon. For example, to determine whenever a triangle is equilateral, isosceles or scalene.

## How to start the server

- Navigate to `Application` class and press the play button from IntelliJ. 
- Or run the gradle task: `./gradlew bootRun`. (NOTE: If you are getting `unresolved reference error`, check [this post](https://stackoverflow.com/questions/53510862/random-unresolved-reference-error-while-executing-gradle-task).)

## How to make a request

```bash
curl -X POST \
  http://localhost:8080/v1/categorize \
  -H 'Content-Type: application/json' \
  -d '[3,4,5]'
```

It is a POST request to `/v1/categorize` endpoint which must include in the body of request a payload containing a list of integers representing the sides of the polygon. 

It should return a json containing the `shape` and the `type`. 

### Example

- Request: 
```bash
curl -X POST \
  http://localhost:8080/v1/categorize \
  -H 'Content-Type: application/json' \
  -d '[5,5,5]'
```

- Response: 
```json
{"shape":"Triangle","type":"Equilateral"}
```
