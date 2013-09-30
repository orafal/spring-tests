package example.template;

import java.io.StringWriter;
import java.util.Properties;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

/**
 * Invokes a Velocity template to build applet text based on a supplied context.
 */
public class AppletTextBuilder {
    private static final String TEMPLATE = "appletText.vm";
    private static final VelocityEngine VELOCITY_ENGINE;

    static {
        Properties props = new Properties();
        props.put("resource.loader", "classpath");
        props.put("classpath.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        VELOCITY_ENGINE = new VelocityEngine(props);
    }

    public String buildAppletText(Context ctx) {
        StringWriter result = new StringWriter();
        VelocityContext velocityContext = new VelocityContext();
        velocityContext.put("subject", ctx.getSubject());
        velocityContext.put("documents", ctx.getDocuments());
        getVelocityEngine().mergeTemplate(TEMPLATE, "UTF-8", velocityContext, result);
        return result.toString();
    }

    private VelocityEngine getVelocityEngine() {
        return VELOCITY_ENGINE;
    }
}
