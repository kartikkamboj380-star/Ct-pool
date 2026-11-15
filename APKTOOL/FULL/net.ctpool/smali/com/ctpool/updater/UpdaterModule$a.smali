.class public final Lcom/ctpool/updater/UpdaterModule$a;
.super Lcom/facebook/react/bridge/BaseActivityEventListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ctpool/updater/UpdaterModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/ctpool/updater/UpdaterModule;


# direct methods
.method constructor <init>(Lcom/ctpool/updater/UpdaterModule;)V
    .locals 0

    iput-object p1, p0, Lcom/ctpool/updater/UpdaterModule$a;->m:Lcom/ctpool/updater/UpdaterModule;

    invoke-direct {p0}, Lcom/facebook/react/bridge/BaseActivityEventListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onActivityResult(Landroid/app/Activity;IILandroid/content/Intent;)V
    .locals 0

    if-eqz p1, :cond_0

    iget-object p4, p0, Lcom/ctpool/updater/UpdaterModule$a;->m:Lcom/ctpool/updater/UpdaterModule;

    invoke-static {p4}, Lcom/ctpool/updater/UpdaterModule;->access$getUpdater$p(Lcom/ctpool/updater/UpdaterModule;)LG0/d;

    move-result-object p4

    if-eqz p4, :cond_0

    invoke-virtual {p4, p1, p2, p3}, LG0/d;->e(Landroid/app/Activity;II)V

    :cond_0
    return-void
.end method
