import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
	public static void main(String[] args) {
		System.out.println("成功");

		AnnotationConfigApplicationContext ac = new
				AnnotationConfigApplicationContext();
		ac.register(AppConfig.class);

		ac.refresh();
	}
}
