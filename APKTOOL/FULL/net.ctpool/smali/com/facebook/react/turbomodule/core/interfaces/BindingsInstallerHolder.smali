.class public final Lcom/facebook/react/turbomodule/core/interfaces/BindingsInstallerHolder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LR1/a;
.end annotation


# instance fields
.field private final mHybridData:Lcom/facebook/jni/HybridData;
    .annotation build LR1/a;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/jni/HybridData;)V
    .locals 1

    const-string v0, "mHybridData"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/turbomodule/core/interfaces/BindingsInstallerHolder;->mHybridData:Lcom/facebook/jni/HybridData;

    return-void
.end method
