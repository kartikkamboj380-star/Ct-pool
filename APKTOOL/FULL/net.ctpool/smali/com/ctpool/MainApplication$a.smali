.class public final Lcom/ctpool/MainApplication$a;
.super Lcom/facebook/react/defaults/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ctpool/MainApplication;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final c:Z

.field private final d:Z


# direct methods
.method constructor <init>(Lcom/ctpool/MainApplication;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/react/defaults/c;-><init>(Landroid/app/Application;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/ctpool/MainApplication$a;->d:Z

    return-void
.end method


# virtual methods
.method protected j()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "index"

    return-object v0
.end method

.method protected m()Ljava/util/List;
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/l;

    invoke-direct {v0, p0}, Lcom/facebook/react/l;-><init>(Lcom/facebook/react/L;)V

    invoke-virtual {v0}, Lcom/facebook/react/l;->a()Ljava/util/ArrayList;

    move-result-object v0

    new-instance v1, LF0/a;

    invoke-direct {v1}, LF0/a;-><init>()V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "apply(...)"

    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public u()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    return v0
.end method

.method protected y()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ctpool/MainApplication$a;->d:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method protected z()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ctpool/MainApplication$a;->c:Z

    return v0
.end method
