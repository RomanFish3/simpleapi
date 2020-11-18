# Технология разработки программного обеспечения
> ### Лабораторная работа №1: создание микросервиса на Spring Boot с базой данных
#### Шумаков Роман Владимирович, 3МБД2001
Цель: знакомство с проектированием многослойной архитектуры Web-API
### Инструкция
1. Загрузить проект: `https://github.com/RomanFish3/simpleapi.git`
2. Командв maven
3. Сборка docker-образа: `docker build -t simpleproject:latest . `
   Запуск docker-контейнера: `docker run -p 8080:8080 simpleproject:latest`
4. Команды curl для обращения к эндпоинтам:

  - Получения всех данных: `curl http://localhost:8080/api/v1/payers`
  - Получение по id: `curl http://localhost:8080/api/v1/payers/{1}`
  - Добавление: `curl http://localhost:8080/api/v1/payers`
  - Удвление: `http://localhost:8080/api/v1/payers/{id}`
  - Получение hostname: `http://localhost:8080/api/v1/status`
 
