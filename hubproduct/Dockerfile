# 1. OpenJDK 베이스 이미지 사용
FROM openjdk:17-jdk

# 작성자 정보 추가
LABEL authors="LEE"

# 2. 작업 디렉토리 설정
WORKDIR /catpang

# 3. JAR 파일을 컨테이너로 복사
COPY build/libs/hubproduct.jar /catpang/hubproduct-service.jar


# 4. 애플리케이션 실행
ENTRYPOINT ["java", "-jar", "/catpang/hubproduct-service.jar"]
