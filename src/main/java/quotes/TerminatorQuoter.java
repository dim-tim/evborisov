package quotes;

import javax.annotation.PostConstruct;

/**
 * Created by dima on 13.12.14.
 */
@Profiling
public class TerminatorQuoter implements Quoter {
    @InjectRandomInt(min = 2, max = 7)
    private int repeat;
    private String message;

    @PostConstruct
    public void init() {
        System.out.println("Phase 2 - init(): repeat = " + repeat);
    }

    public TerminatorQuoter() {
        System.out.println("Phase 1 - TerminatorQuoter(): repeat = " + repeat);
    }


    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("Message = " + message);
        }
    }
}
