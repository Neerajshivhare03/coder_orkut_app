package in.coder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class WelcomeTest {

    @Test
    void applicationMainShouldRun() {
        assertDoesNotThrow(() -> Welcome.main(new String[0]));
    }
}
