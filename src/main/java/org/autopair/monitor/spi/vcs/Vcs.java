package org.autopair.monitor.spi.vcs;

import java.util.List;

import org.autopair.monitor.FileSystemChange;

public interface Vcs
{
    public List<FileSystemChange> status();
}
