- covid19 api : https://documenter.getpostman.com/view/10808728/SzS8rjbc#intro

- 개발 환경
    - mac os
    - intellij 
    - openjdk 11
    - gradle
    - spring mvc,web 5.xx
    - tomcat 9
  
- 문제
  - view의 prefix나 suffix를 다르게 설정하는 것이 잘 안 됨
    - html 확장자로 변경 안 됨.
  - js 파일 임포트 안 됨..
    - 왜 js 파일을 임포트하는데 이런 오류가 발생하는지? 
       ```
        DispatcherServlet.noHandlerFound No mapping for GET /js/index.js
       ```
  - data bind