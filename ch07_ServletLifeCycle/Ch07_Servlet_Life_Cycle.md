# Ch07_Servlet_Life_Cycle

*서블릿 생성 주기*

![](C:\Users\namkun\Desktop\JSP 교재\마크다운 기록\Ch07_ServletLifeCycle\서블릿생명주기.png)

* 서블릿이 처음 생성되는 단계 - init()
* 서블릿이 일하는 단계 - service
* 서블릿이 컨테이너에서 소멸될 때 - destroy()

* @PostConstruct - 서블릿의 준비단계
* @PreDestroy - 서블릿 소멸 뒤 정리.

*생명주기 관련 메서드*

![](C:\Users\namkun\Desktop\JSP 교재\마크다운 기록\Ch07_ServletLifeCycle\생명주기관련메서드.png)

* 단계별로 callback 메서드를 제공함으로써, 각 단계별로 기능을 추가할 수 있다.
* 실제로 제공할 서비스에 대해 작업을 하는 것은 `doGet`에서 주로 한다.



#### init()

어떠한 일이 서블릿이 생성되는 시점에 하고싶다. 주로 많이 하는 것은 데이터 서버의 로그인 아이디와 패스워드를 어떤 변수에 담는다거나, 항상 공통적으로 이루어지는 업무를 여기서 수행한다.

#### destroy()

만약 DB를 사용하면 사용한 후에 자원해제를 한다거나, 웹소스에 있는 resource를 사용하고 반납해야할 때 주로 사용한다.