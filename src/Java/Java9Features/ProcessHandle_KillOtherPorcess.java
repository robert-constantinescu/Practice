package Java.Java9Features;

public class ProcessHandle_KillOtherPorcess {


    public static void main(String[] args) {

        ProcessHandle textEditHandle = ProcessHandle.allProcesses()
                                            .filter(process -> process.info().commandLine()
                                            .map(cmd-> cmd.contains("TestEdit")).orElse(false))
                                            .findFirst()
                                            .orElseThrow(() -> new IllegalArgumentException("No matching handle found"));

        System.out.println(textEditHandle.info());

        textEditHandle.onExit()
                /*
                the onExit() method returns a CompletableFuture.
                CompletableFuture can be asynchronously completed at some point later in time.
                In this case it is completed once the process has quit
                 */
                .thenAccept(process -> System.out.println("TextEdit was killed by Java"));

        boolean shutdown = textEditHandle.destroy();

        textEditHandle.onExit().join();
        System.out.println("Shutdown: " + shutdown);



    }
}
