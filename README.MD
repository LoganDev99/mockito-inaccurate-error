Run `mvn clean test`
The test will failure. Which is correct. But the error message isn't correct.

Output:
```
Argument(s) are different! Wanted:
myService.myMethod(MyClass(myValue=1));
-> at com.example.mockitoissue.MyService.myMethod(MockitoissueApplicationTests.java:27)
Actual invocations have different arguments:
myService.myMethod(MyClass(myValue=1));
-> at com.example.mockitoissue.MockitoissueApplicationTests.contextLoads(MockitoissueApplicationTests.java:18)
```

Wanted should show a string value the number 1 for `myValue=1`. 
Instead both are shown as the same.

Clicking `<Click to see difference>` in accurately shows the difference being a new line.