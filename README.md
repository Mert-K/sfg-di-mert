- Understanding Spring IoC(Inversion of Control) Container (=ApplicationContext)
- Default bean naming convention in Application Context(=in SfgDiMertApplication Class)
- Dependency Injection without Spring in test classes through JUNit5 test(PropertyInjectedControllerTest,SetterInjectedControllerTest,ConstructorInjectedControllerTest). Mimicking what the ApplicationContext does.
- Dependency Injection in ApplicationContext with stereotypes(=PropertyInjectedController, SetterInjectedConttoller, ConstructorInjectedController, GreetingServiceImpl). 
- Using Qualifier annotation for ConstructorInjectedController, PropertyInjectedController, SetterInjectedController for injection of GreetingService in the controllers. There is 3 same service(=GreetingService) implementation. So injection of services in controllers should be determined by Qualifier annotation to block confusion.
- Using Primary annotation at service implementation (=PrimaryGreetingService). 
- Using Profile annotation to create beans only with active profiles (I18nEnglishGreetingService, I18nSpanishGreetingService, testing in I18nController).
- Using default Profile
- Using Multiple Active Profile
- Using Annotation Based Configuration
- Using Java Based Configuration
- Using XML Based Configuration
- Using ComponentScan annotation
- Spring Bean Scope