.class public abstract Lcom/facebook/react/devsupport/h0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/devsupport/h0$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/util/regex/Pattern;

.field private static final b:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "^(?:(.*?)@)?(.*?)\\:([0-9]+)\\:([0-9]+)$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/facebook/react/devsupport/h0;->a:Ljava/util/regex/Pattern;

    const-string v0, "\\s*(?:at)\\s*(.+?)\\s*[@(](.*):([0-9]+):([0-9]+)[)]$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/facebook/react/devsupport/h0;->b:Ljava/util/regex/Pattern;

    return-void
.end method

.method public static a(Ljava/lang/Throwable;)[LX1/j;
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    array-length v0, p0

    .line 6
    new-array v0, v0, [LX1/j;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    array-length v2, p0

    .line 10
    if-ge v1, v2, :cond_0

    .line 11
    .line 12
    new-instance v2, Lcom/facebook/react/devsupport/h0$a;

    .line 13
    .line 14
    aget-object v3, p0, v1

    .line 15
    .line 16
    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    aget-object v3, p0, v1

    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    aget-object v3, p0, v1

    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    aget-object v3, p0, v1

    .line 33
    .line 34
    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getLineNumber()I

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    const/4 v8, -0x1

    .line 39
    const/4 v9, 0x0

    .line 40
    move-object v3, v2

    .line 41
    invoke-direct/range {v3 .. v9}, Lcom/facebook/react/devsupport/h0$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILcom/facebook/react/devsupport/g0;)V

    .line 42
    .line 43
    .line 44
    aput-object v2, v0, v1

    .line 45
    .line 46
    add-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    return-object v0
.end method

.method public static b(Lcom/facebook/react/bridge/ReadableArray;)[LX1/j;
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    invoke-interface {p0}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v1, v0

    .line 10
    :goto_0
    new-array v2, v1, [LX1/j;

    .line 11
    .line 12
    move v3, v0

    .line 13
    :goto_1
    if-ge v3, v1, :cond_6

    .line 14
    .line 15
    invoke-interface {p0, v3}, Lcom/facebook/react/bridge/ReadableArray;->getType(I)Lcom/facebook/react/bridge/ReadableType;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    sget-object v5, Lcom/facebook/react/bridge/ReadableType;->Map:Lcom/facebook/react/bridge/ReadableType;

    .line 20
    .line 21
    if-ne v4, v5, :cond_4

    .line 22
    .line 23
    invoke-interface {p0, v3}, Lcom/facebook/react/bridge/ReadableArray;->getMap(I)Lcom/facebook/react/bridge/ReadableMap;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    const-string v5, "methodName"

    .line 28
    .line 29
    invoke-interface {v4, v5}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v8

    .line 33
    const-string v5, "file"

    .line 34
    .line 35
    invoke-interface {v4, v5}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v7

    .line 39
    const-string v5, "collapse"

    .line 40
    .line 41
    invoke-interface {v4, v5}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    if-eqz v6, :cond_1

    .line 46
    .line 47
    invoke-interface {v4, v5}, Lcom/facebook/react/bridge/ReadableMap;->isNull(Ljava/lang/String;)Z

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    if-nez v6, :cond_1

    .line 52
    .line 53
    invoke-interface {v4, v5}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-eqz v5, :cond_1

    .line 58
    .line 59
    const/4 v5, 0x1

    .line 60
    move v11, v5

    .line 61
    goto :goto_2

    .line 62
    :cond_1
    move v11, v0

    .line 63
    :goto_2
    const-string v5, "lineNumber"

    .line 64
    .line 65
    invoke-interface {v4, v5}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    const/4 v9, -0x1

    .line 70
    if-eqz v6, :cond_2

    .line 71
    .line 72
    invoke-interface {v4, v5}, Lcom/facebook/react/bridge/ReadableMap;->isNull(Ljava/lang/String;)Z

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    if-nez v6, :cond_2

    .line 77
    .line 78
    invoke-interface {v4, v5}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    goto :goto_3

    .line 83
    :cond_2
    move v5, v9

    .line 84
    :goto_3
    const-string v6, "column"

    .line 85
    .line 86
    invoke-interface {v4, v6}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 87
    .line 88
    .line 89
    move-result v10

    .line 90
    if-eqz v10, :cond_3

    .line 91
    .line 92
    invoke-interface {v4, v6}, Lcom/facebook/react/bridge/ReadableMap;->isNull(Ljava/lang/String;)Z

    .line 93
    .line 94
    .line 95
    move-result v10

    .line 96
    if-nez v10, :cond_3

    .line 97
    .line 98
    invoke-interface {v4, v6}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    move v10, v4

    .line 103
    goto :goto_4

    .line 104
    :cond_3
    move v10, v9

    .line 105
    :goto_4
    new-instance v4, Lcom/facebook/react/devsupport/h0$a;

    .line 106
    .line 107
    const/4 v12, 0x0

    .line 108
    move-object v6, v4

    .line 109
    move v9, v5

    .line 110
    invoke-direct/range {v6 .. v12}, Lcom/facebook/react/devsupport/h0$a;-><init>(Ljava/lang/String;Ljava/lang/String;IIZLcom/facebook/react/devsupport/g0;)V

    .line 111
    .line 112
    .line 113
    aput-object v4, v2, v3

    .line 114
    .line 115
    goto :goto_5

    .line 116
    :cond_4
    sget-object v5, Lcom/facebook/react/bridge/ReadableType;->String:Lcom/facebook/react/bridge/ReadableType;

    .line 117
    .line 118
    if-ne v4, v5, :cond_5

    .line 119
    .line 120
    new-instance v4, Lcom/facebook/react/devsupport/h0$a;

    .line 121
    .line 122
    invoke-interface {p0, v3}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v8

    .line 126
    const/4 v10, -0x1

    .line 127
    const/4 v11, 0x0

    .line 128
    const/4 v7, 0x0

    .line 129
    const/4 v9, -0x1

    .line 130
    move-object v6, v4

    .line 131
    invoke-direct/range {v6 .. v11}, Lcom/facebook/react/devsupport/h0$a;-><init>(Ljava/lang/String;Ljava/lang/String;IILcom/facebook/react/devsupport/g0;)V

    .line 132
    .line 133
    .line 134
    aput-object v4, v2, v3

    .line 135
    .line 136
    :cond_5
    :goto_5
    add-int/lit8 v3, v3, 0x1

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_6
    return-object v2
.end method

.method public static c(Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedError;)Lcom/facebook/react/bridge/JavaOnlyMap;
    .locals 7

    .line 1
    invoke-interface {p0}, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedError;->getFrames()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedError$StackFrame;

    new-instance v3, Lcom/facebook/react/bridge/JavaOnlyMap;

    invoke-direct {v3}, Lcom/facebook/react/bridge/JavaOnlyMap;-><init>()V

    invoke-interface {v2}, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedError$StackFrame;->getColumnNumber()I

    move-result v4

    int-to-double v4, v4

    const-string v6, "column"

    invoke-virtual {v3, v6, v4, v5}, Lcom/facebook/react/bridge/JavaOnlyMap;->putDouble(Ljava/lang/String;D)V

    invoke-interface {v2}, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedError$StackFrame;->getLineNumber()I

    move-result v4

    int-to-double v4, v4

    const-string v6, "lineNumber"

    invoke-virtual {v3, v6, v4, v5}, Lcom/facebook/react/bridge/JavaOnlyMap;->putDouble(Ljava/lang/String;D)V

    const-string v4, "file"

    invoke-interface {v2}, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedError$StackFrame;->getFileName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/facebook/react/bridge/JavaOnlyMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "methodName"

    invoke-interface {v2}, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedError$StackFrame;->getMethodName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v4, v2}, Lcom/facebook/react/bridge/JavaOnlyMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/facebook/react/bridge/JavaOnlyMap;

    invoke-direct {v0}, Lcom/facebook/react/bridge/JavaOnlyMap;-><init>()V

    const-string v2, "message"

    invoke-interface {p0}, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedError;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/facebook/react/bridge/JavaOnlyMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "stack"

    invoke-static {v1}, Lcom/facebook/react/bridge/JavaOnlyArray;->from(Ljava/util/List;)Lcom/facebook/react/bridge/JavaOnlyArray;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lcom/facebook/react/bridge/JavaOnlyMap;->putArray(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    const-string v1, "id"

    invoke-interface {p0}, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedError;->getExceptionId()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/bridge/JavaOnlyMap;->putInt(Ljava/lang/String;I)V

    const-string v1, "isFatal"

    invoke-interface {p0}, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedError;->isFatal()Z

    move-result p0

    invoke-virtual {v0, v1, p0}, Lcom/facebook/react/bridge/JavaOnlyMap;->putBoolean(Ljava/lang/String;Z)V

    return-object v0
.end method

.method public static d(LX1/j;)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, LX1/j;->getFileName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-interface {p0}, LX1/j;->a()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-lez v1, :cond_0

    .line 18
    .line 19
    const-string v2, ":"

    .line 20
    .line 21
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-interface {p0}, LX1/j;->e()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-lez p0, :cond_0

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method
