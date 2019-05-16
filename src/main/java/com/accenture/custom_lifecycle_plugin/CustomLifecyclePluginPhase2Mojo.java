package com.accenture.custom_lifecycle_plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo( name = "phase2Goal", defaultPhase = LifecyclePhase.PROCESS_SOURCES )
public class CustomLifecyclePluginPhase2Mojo extends AbstractMojo {

	public void execute() throws MojoExecutionException, MojoFailureException {
		 getLog().info("Doing Phase 2 stuff. Oh yeah baby.");

	}

}
