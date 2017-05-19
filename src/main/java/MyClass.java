import com.codahale.metrics.annotation.Timed;
import io.astefanutti.metrics.aspectj.Metrics;

@Metrics(registry="myRegistry")
public class MyClass {
	@Timed(name="myTimer")
	public void method() {
		System.out.println("hello");
	}
}
