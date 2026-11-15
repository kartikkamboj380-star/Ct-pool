.class public final synthetic Lb3/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Lb3/v;


# direct methods
.method public synthetic constructor <init>(Lb3/v;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb3/t;->m:Lb3/v;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lb3/t;->m:Lb3/v;

    invoke-static {v0}, Lb3/v;->b(Lb3/v;)V

    return-void
.end method
