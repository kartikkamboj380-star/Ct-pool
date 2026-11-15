.class public final synthetic Lcom/google/firebase/messaging/Q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Landroid/content/Context;

.field public final synthetic n:Z

.field public final synthetic o:Lz3/m;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;ZLz3/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/messaging/Q;->m:Landroid/content/Context;

    iput-boolean p2, p0, Lcom/google/firebase/messaging/Q;->n:Z

    iput-object p3, p0, Lcom/google/firebase/messaging/Q;->o:Lz3/m;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/firebase/messaging/Q;->m:Landroid/content/Context;

    iget-boolean v1, p0, Lcom/google/firebase/messaging/Q;->n:Z

    iget-object v2, p0, Lcom/google/firebase/messaging/Q;->o:Lz3/m;

    invoke-static {v0, v1, v2}, Lcom/google/firebase/messaging/S;->a(Landroid/content/Context;ZLz3/m;)V

    return-void
.end method
