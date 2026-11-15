.class public final Lcom/facebook/react/runtime/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/runtime/d$a;
    }
.end annotation


# static fields
.field private static final c:Lcom/facebook/react/runtime/d$a;


# instance fields
.field private final a:Z

.field private final b:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/react/runtime/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/runtime/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/facebook/react/runtime/d;->c:Lcom/facebook/react/runtime/d$a;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/facebook/react/runtime/d;->a:Z

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p1}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/react/runtime/d;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method protected final a(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "state"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "BridgelessReact"

    invoke-static {v0, p1}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/facebook/react/runtime/d;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/runtime/d;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method
