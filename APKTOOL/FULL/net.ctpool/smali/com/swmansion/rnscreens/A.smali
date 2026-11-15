.class public final synthetic Lcom/swmansion/rnscreens/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Landroid/app/Activity;

.field public final synthetic n:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/swmansion/rnscreens/A;->m:Landroid/app/Activity;

    iput-object p2, p0, Lcom/swmansion/rnscreens/A;->n:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/A;->m:Landroid/app/Activity;

    iget-object v1, p0, Lcom/swmansion/rnscreens/A;->n:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/swmansion/rnscreens/C;->a(Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method
