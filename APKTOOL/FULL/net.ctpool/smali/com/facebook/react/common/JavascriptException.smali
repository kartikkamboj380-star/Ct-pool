.class public Lcom/facebook/react/common/JavascriptException;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# annotations
.annotation build LR1/a;
.end annotation


# instance fields
.field private m:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string v0, "jsStackTrace"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lcom/facebook/react/common/JavascriptException;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/common/JavascriptException;->m:Ljava/lang/String;

    return-object p0
.end method
