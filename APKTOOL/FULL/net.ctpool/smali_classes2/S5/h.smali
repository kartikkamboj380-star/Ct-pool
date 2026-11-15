.class public final synthetic LS5/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Landroid/content/Context;

.field public final synthetic n:Landroid/content/Intent;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS5/h;->m:Landroid/content/Context;

    iput-object p2, p0, LS5/h;->n:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, LS5/h;->m:Landroid/content/Context;

    iget-object v1, p0, LS5/h;->n:Landroid/content/Intent;

    invoke-static {v0, v1}, LS5/i;->e(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method
