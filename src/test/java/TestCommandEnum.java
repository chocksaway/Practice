import com.chocksaway.model.command.CommandType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCommandEnum {
    @Test
    public void testCommandEnum() {
        assertEquals(CommandType.MyCommand.ONE, CommandType.execute("ONE"));
        assertEquals(CommandType.MyCommand.TWO, CommandType.execute("TWO"));
        assertEquals(CommandType.MyCommand.THREE, CommandType.execute("THREE"));
    }
}
