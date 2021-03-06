package com.hp.ts.rnd.tool.perf.threads;

public interface ThreadStackTrace {

	public long THREAD_ID_NOTSUPPOT = 0L;

	// 0 if not support
	public long getThreadIdentifier();

	public String getThreadName();

	public Thread.State getThreadState();

	public ThreadStackFrame[] getStackFrames();

	public GeneralThreadStackTrace toGeneralTrace();

}
