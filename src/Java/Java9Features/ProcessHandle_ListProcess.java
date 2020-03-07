package Java.Java9Features;

/*
java.lang.Process
    - Represents native process created from Java

java.lang.ProcessHandle
    - Represents any native process on the operating system


new method in process: - toHandle() which returns a ProcessHandle object and exposes new information about a process
                       - or you can use the ProcessHandle.of(123)  (123 - represents the process id)

ProcessHandle process = ProcessHandle.of(123);
ProcessHandle.Info  processInfo = process.info();

the .info() method returns a ProcessHandle.Info which can give you more info about the wanted process

How to get your own process id (pid):
        - ProcessHandle.current.pid();

you can:
    - Kill your own process:
            ProcessHandle.current.destroyForcibly()  without any notice

 */

import java.time.Instant;
import java.util.Comparator;

public class ProcessHandle_ListProcess {

    //Listing all system processes
    //Find and destroy a process

    public static void main(String[] args) {
        ProcessHandle.allProcesses()
                .map(ProcessHandle::info)
                .sorted(Comparator.comparing(info -> info.startInstant().orElse(Instant.MAX)))
                .forEach(ProcessHandle_ListProcess::printInfo);

    }

    public static void printInfo(ProcessHandle.Info info) {
        if(info.startInstant().isPresent() && info.command().isPresent()) {
            System.out.println(("Started at: " + info.startInstant().get() +
                               ", Command: " + info.command().get())) ;
        }
    }

}

