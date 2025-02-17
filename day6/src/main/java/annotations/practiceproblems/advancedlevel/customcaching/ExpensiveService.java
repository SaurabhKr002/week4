package annotations.practiceproblems.advancedlevel.customcaching;

// Interface to define expensive calculations
public interface ExpensiveService {
    @CacheResult
    long factorial(int n);
}

// Implementation of ExpensiveService
class ExpensiveServiceImpl implements ExpensiveService {
    @Override
    public long factorial(int n) {
        System.out.println("Computing factorial of " + n);
        return (n == 0 || n == 1) ? 1 : n * factorial(n - 1);
    }
}
