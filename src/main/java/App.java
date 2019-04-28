import bt.Contract;
import bt.ui.EmulatorWindow;

/**
 * Modify this class for your new BlockTalk smart contract. 
 *
 * Just run this class to start a BlockTalk emulator for testing,
 * debugging, or compiling to AT bytecode.
 * 
 * @author jjos
 */
public class App extends Contract {

    @Override
    public void txReceived() {
        // In this sample we simply send back funds received (minus activation fee)
        sendAmount(getCurrentTx().getAmount(),
            getCurrentTx().getSenderAddress());
    }

    /**
     * The main function is for debugging purposes only it will not be
     * compiled to AT bytecode.
     */
    public static void main(String[] args) {
        new EmulatorWindow(App.class);
    }
}
