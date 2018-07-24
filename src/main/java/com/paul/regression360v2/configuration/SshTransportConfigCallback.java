package com.paul.regression360v2.configuration;

import org.eclipse.jgit.api.TransportConfigCallback;
import org.eclipse.jgit.transport.JschConfigSessionFactory;
import org.eclipse.jgit.transport.OpenSshConfig;
import org.eclipse.jgit.transport.SshSessionFactory;
import org.eclipse.jgit.transport.SshTransport;
import org.eclipse.jgit.transport.Transport;

import com.jcraft.jsch.Session;

//Class that contains the SSH configuration to pick up the ssh key from the system.
public class SshTransportConfigCallback implements TransportConfigCallback {

    private final SshSessionFactory sshSessionFactory = new JschConfigSessionFactory() {
        @Override
        protected void configure(final OpenSshConfig.Host hc, final Session session) {
            session.setConfig("StrictHostKeyChecking", "no");
        }
    };

    public void configure(final Transport transport) {
        SshTransport sshTransport = (SshTransport) transport;
        sshTransport.setSshSessionFactory(sshSessionFactory);
    }
}

