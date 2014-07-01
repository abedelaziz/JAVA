
public class FactorialOne implements Factorial {
public int fac(int n){
	int f=1;
	for(int i=2;i<=n;i++)
		f*=i;
	return f;
}

}
