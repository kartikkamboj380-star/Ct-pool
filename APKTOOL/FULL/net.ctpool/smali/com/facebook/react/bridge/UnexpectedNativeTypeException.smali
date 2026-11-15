.class public final Lcom/facebook/react/bridge/UnexpectedNativeTypeException;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# annotations
.annotation build LR1/a;
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string v0, "msg"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    return-void
.end method
