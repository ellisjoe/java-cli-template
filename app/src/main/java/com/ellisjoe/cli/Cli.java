/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.ellisjoe.cli;

import picocli.CommandLine;
import picocli.CommandLine.Option;

public class Cli {
    public static void main(String[] args) {
        Args parsedArgs = new Args();
        new CommandLine(parsedArgs).parseArgs(args);

        System.out.println(String.format("Hello %s!", parsedArgs.name));
    }

    private static class Args {
        @Option(names = {"-n", "--name"}, required = true)
        String name;
    }
}
