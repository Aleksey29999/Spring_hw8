package com.example.empl4sem2CRUD.aspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class RegistrationActions extends Exception{

    @AfterReturning(value = "@annotation(TrackUserAction)", returning = "returning") // место куда внеднряется (где выполняется) метод
    public void beforeAnyMethodInUserService(JoinPoint joinPoint, Object returning) {
        System.out.println("Вызван метод" + joinPoint.getSignature().getName() + " в классе " + returning.getClass()); // реализация метода (вывод метода и класса вызываемого в процессе выполнения программы)

    }
}


