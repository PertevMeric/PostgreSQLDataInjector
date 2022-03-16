package com.pertevmeric.java;
import com.jcraft.jsch.JSchException;
import com.pastdev.jsch.DefaultSessionFactory;
import com.pastdev.jsch.command.CommandRunner;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CommandInjector { //Injects any shell command to the connected machine

    CommandInjector(String hostname, String username, String password, Integer port, String script) throws JSchException, IOException {

        DefaultSessionFactory sessionFactory = new DefaultSessionFactory(username, hostname, port);

        Map props = new HashMap<String, String>();

        props.put("StrictHostKeyChecking", "no");

        sessionFactory.setConfig(props);

        sessionFactory.setPassword(password);

        CommandRunner runner = new CommandRunner(sessionFactory);

        String command = script;

        CommandRunner.ExecuteResult result = runner.execute(command);

        if (result.getStderr().isEmpty()) {
            System.out.println(result.getStdout());
        } else {
            System.out.println(result.getStderr());
        }

        runner.close();
    }
}