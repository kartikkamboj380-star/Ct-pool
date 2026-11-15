.class public final synthetic Lj4/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Lj4/n;


# direct methods
.method public synthetic constructor <init>(Lj4/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj4/l;->m:Lj4/n;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lj4/l;->m:Lj4/n;

    invoke-static {v0}, Lj4/n;->a(Lj4/n;)V

    return-void
.end method
