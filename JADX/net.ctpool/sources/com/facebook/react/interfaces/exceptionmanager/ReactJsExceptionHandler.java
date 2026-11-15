package com.facebook.react.interfaces.exceptionmanager;

import java.util.ArrayList;
import java.util.List;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public interface ReactJsExceptionHandler {

    public interface ParsedError {

        public interface StackFrame {
            int getColumnNumber();

            String getFileName();

            int getLineNumber();

            String getMethodName();
        }

        int getExceptionId();

        List<StackFrame> getFrames();

        String getMessage();

        boolean isFatal();
    }

    private static final class ParsedErrorImpl implements ParsedError {
        private final int exceptionId;
        private final ArrayList<ParsedStackFrameImpl> frames;
        private final boolean isFatal;
        private final String message;

        public ParsedErrorImpl(ArrayList<ParsedStackFrameImpl> arrayList, String str, int i7, boolean z6) {
            k.f(arrayList, "frames");
            k.f(str, "message");
            this.frames = arrayList;
            this.message = str;
            this.exceptionId = i7;
            this.isFatal = z6;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ParsedErrorImpl copy$default(ParsedErrorImpl parsedErrorImpl, ArrayList arrayList, String str, int i7, boolean z6, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                arrayList = parsedErrorImpl.frames;
            }
            if ((i8 & 2) != 0) {
                str = parsedErrorImpl.message;
            }
            if ((i8 & 4) != 0) {
                i7 = parsedErrorImpl.exceptionId;
            }
            if ((i8 & 8) != 0) {
                z6 = parsedErrorImpl.isFatal;
            }
            return parsedErrorImpl.copy(arrayList, str, i7, z6);
        }

        public final ArrayList<ParsedStackFrameImpl> component1() {
            return this.frames;
        }

        public final String component2() {
            return this.message;
        }

        public final int component3() {
            return this.exceptionId;
        }

        public final boolean component4() {
            return this.isFatal;
        }

        public final ParsedErrorImpl copy(ArrayList<ParsedStackFrameImpl> arrayList, String str, int i7, boolean z6) {
            k.f(arrayList, "frames");
            k.f(str, "message");
            return new ParsedErrorImpl(arrayList, str, i7, z6);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ParsedErrorImpl)) {
                return false;
            }
            ParsedErrorImpl parsedErrorImpl = (ParsedErrorImpl) obj;
            return k.b(this.frames, parsedErrorImpl.frames) && k.b(this.message, parsedErrorImpl.message) && this.exceptionId == parsedErrorImpl.exceptionId && this.isFatal == parsedErrorImpl.isFatal;
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ParsedError
        public int getExceptionId() {
            return this.exceptionId;
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ParsedError
        public ArrayList<ParsedStackFrameImpl> getFrames() {
            return this.frames;
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ParsedError
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return (((((this.frames.hashCode() * 31) + this.message.hashCode()) * 31) + Integer.hashCode(this.exceptionId)) * 31) + Boolean.hashCode(this.isFatal);
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ParsedError
        public boolean isFatal() {
            return this.isFatal;
        }

        public String toString() {
            return "ParsedErrorImpl(frames=" + this.frames + ", message=" + this.message + ", exceptionId=" + this.exceptionId + ", isFatal=" + this.isFatal + ")";
        }
    }

    private static final class ParsedStackFrameImpl implements ParsedError.StackFrame {
        private final int columnNumber;
        private final String fileName;
        private final int lineNumber;
        private final String methodName;

        public ParsedStackFrameImpl(String str, String str2, int i7, int i8) {
            k.f(str, "fileName");
            k.f(str2, "methodName");
            this.fileName = str;
            this.methodName = str2;
            this.lineNumber = i7;
            this.columnNumber = i8;
        }

        public static /* synthetic */ ParsedStackFrameImpl copy$default(ParsedStackFrameImpl parsedStackFrameImpl, String str, String str2, int i7, int i8, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                str = parsedStackFrameImpl.fileName;
            }
            if ((i9 & 2) != 0) {
                str2 = parsedStackFrameImpl.methodName;
            }
            if ((i9 & 4) != 0) {
                i7 = parsedStackFrameImpl.lineNumber;
            }
            if ((i9 & 8) != 0) {
                i8 = parsedStackFrameImpl.columnNumber;
            }
            return parsedStackFrameImpl.copy(str, str2, i7, i8);
        }

        public final String component1() {
            return this.fileName;
        }

        public final String component2() {
            return this.methodName;
        }

        public final int component3() {
            return this.lineNumber;
        }

        public final int component4() {
            return this.columnNumber;
        }

        public final ParsedStackFrameImpl copy(String str, String str2, int i7, int i8) {
            k.f(str, "fileName");
            k.f(str2, "methodName");
            return new ParsedStackFrameImpl(str, str2, i7, i8);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ParsedStackFrameImpl)) {
                return false;
            }
            ParsedStackFrameImpl parsedStackFrameImpl = (ParsedStackFrameImpl) obj;
            return k.b(this.fileName, parsedStackFrameImpl.fileName) && k.b(this.methodName, parsedStackFrameImpl.methodName) && this.lineNumber == parsedStackFrameImpl.lineNumber && this.columnNumber == parsedStackFrameImpl.columnNumber;
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ParsedError.StackFrame
        public int getColumnNumber() {
            return this.columnNumber;
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ParsedError.StackFrame
        public String getFileName() {
            return this.fileName;
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ParsedError.StackFrame
        public int getLineNumber() {
            return this.lineNumber;
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ParsedError.StackFrame
        public String getMethodName() {
            return this.methodName;
        }

        public int hashCode() {
            return (((((this.fileName.hashCode() * 31) + this.methodName.hashCode()) * 31) + Integer.hashCode(this.lineNumber)) * 31) + Integer.hashCode(this.columnNumber);
        }

        public String toString() {
            return "ParsedStackFrameImpl(fileName=" + this.fileName + ", methodName=" + this.methodName + ", lineNumber=" + this.lineNumber + ", columnNumber=" + this.columnNumber + ")";
        }
    }

    void reportJsException(ParsedError parsedError);
}
