.class public abstract Lcom/facebook/react/runtime/BindingsInstaller;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/runtime/BindingsInstaller$a;
    }
.end annotation


# static fields
.field private static final Companion:Lcom/facebook/react/runtime/BindingsInstaller$a;


# instance fields
.field private final mHybridData:Lcom/facebook/jni/HybridData;
    .annotation build LR1/a;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/react/runtime/BindingsInstaller$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/runtime/BindingsInstaller$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/facebook/react/runtime/BindingsInstaller;->Companion:Lcom/facebook/react/runtime/BindingsInstaller$a;

    const-string v0, "rninstance"

    invoke-static {v0}, Lcom/facebook/soloader/SoLoader;->t(Ljava/lang/String;)Z

    return-void
.end method

.method public constructor <init>(Lcom/facebook/jni/HybridData;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/runtime/BindingsInstaller;->mHybridData:Lcom/facebook/jni/HybridData;

    return-void
.end method
