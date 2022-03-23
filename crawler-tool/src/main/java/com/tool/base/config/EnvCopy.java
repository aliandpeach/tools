package com.tool.base.config;

import com.ulisesbocchio.jasyptspringboot.EncryptablePropertySource;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertySource;
import org.springframework.core.env.StandardEnvironment;

public class EnvCopy
{
    private StandardEnvironment copy;

    EnvCopy(final ConfigurableEnvironment environment)
    {
        copy = new StandardEnvironment();
        environment.getPropertySources().forEach(ps ->
        {
            final PropertySource<?> original = ps instanceof EncryptablePropertySource
                    ? ((EncryptablePropertySource) ps).getDelegate()
                    : ps;
            copy.getPropertySources().addLast(original);
        });
    }

    public ConfigurableEnvironment get()
    {
        return copy;
    }
}
