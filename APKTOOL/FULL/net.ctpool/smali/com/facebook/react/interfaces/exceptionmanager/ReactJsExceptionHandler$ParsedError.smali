.class public interface abstract Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedError;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "ParsedError"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedError$StackFrame;
    }
.end annotation


# virtual methods
.method public abstract getExceptionId()I
.end method

.method public abstract getFrames()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedError$StackFrame;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getMessage()Ljava/lang/String;
.end method

.method public abstract isFatal()Z
.end method
