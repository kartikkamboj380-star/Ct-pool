.class public final synthetic Lh4/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg4/a;


# instance fields
.field public final synthetic a:Lh4/A;


# direct methods
.method public synthetic constructor <init>(Lh4/A;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh4/y;->a:Lh4/A;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh4/y;->a:Lh4/A;

    invoke-virtual {v0, p1}, Lh4/A;->B(Ljava/lang/String;)V

    return-void
.end method
